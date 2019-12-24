package problemsolving.queensattack2;

import java.io.*;
import java.util.*;


class ObstacleCoords {
	private final int obs_r;
	private final int obs_c;
	
	public ObstacleCoords(int obs_x, int obs_y) {
		this.obs_r = obs_x;
		this.obs_c = obs_y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		ObstacleCoords other = (ObstacleCoords) obj;
		return other.obs_r == obs_r && other.obs_c == obs_c;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(obs_r, obs_c);
	}
	
}

public class Solution {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
    	int result = 0;
    	
    	final Set<ObstacleCoords> obstacleCoordinates =  new HashSet<>();
    	for(int[] array: obstacles) {
    		obstacleCoordinates.add(new ObstacleCoords(array[0], array[1]));
    	}
    	int curr_r = r_q;
    	int curr_c = c_q;
    	
    	// move north
    	
    	while(++curr_r <= n) {
    		if(!obstacleCoordinates.contains(new ObstacleCoords(curr_r, curr_c))) {
    			result++;
    		} else {
    			break;
    		}
    	}
    	
    	// move south
    	curr_r = r_q;
    	while(--curr_r > 0) {
    		if(!obstacleCoordinates.contains(new ObstacleCoords(curr_r, curr_c))) {
    			result++;
    		} else {
    			break;
    		}
    	}
    	
    	// move east
    	curr_r = r_q;
    	while(++curr_c <= n) {
    		if(!obstacleCoordinates.contains(new ObstacleCoords(curr_r, curr_c))) {
    			result++;
    		} else {
    			break;
    		}
    	}

    	// move west
    	curr_c = c_q;
    	while(--curr_c > 0) {
    		if(!obstacleCoordinates.contains(new ObstacleCoords(curr_r, curr_c))) {
    			result++;
    		} else {
    			break;
    		}
    	}
    	
    	// move north-east
    	curr_c = c_q;
    	while(++curr_c <= n && ++curr_r <= n) {
    		if(!obstacleCoordinates.contains(new ObstacleCoords(curr_r, curr_c))) {
    			result++;
    		} else {
    			break;
    		}
    	}
    	
    	// move south-west
    	curr_c = c_q;
    	curr_r = r_q;
    	while(--curr_c > 0 && --curr_r > 0) {
    		if(!obstacleCoordinates.contains(new ObstacleCoords(curr_r, curr_c))) {
    			result++;
    		} else {
    			break;
    		}
    	}
    	
    	// move north-west
    	curr_c = c_q;
    	curr_r = r_q;
    	while(--curr_c > 0 && ++curr_r <= n) {
    		if(!obstacleCoordinates.contains(new ObstacleCoords(curr_r, curr_c))) {
    			result++;
    		} else {
    			break;
    		}
    	}

    	// move south-east
    	curr_c = c_q;
    	curr_r = r_q;
    	while(--curr_r > 0 && ++curr_c <= n) {
    		if(!obstacleCoordinates.contains(new ObstacleCoords(curr_r, curr_c))) {
    			result++;
    		} else {
    			break;
    		}
    	}
    	
    	return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
        		new FileReader("queensattack2.txt"));
        Scanner scanner = new Scanner(br);

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        System.out.println(String.valueOf(result));
        

        scanner.close();
    }
}
