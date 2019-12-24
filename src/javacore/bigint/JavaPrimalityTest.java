package javacore.bigint;

import java.math.BigInteger;

public class JavaPrimalityTest {
	
	public static void isPrime(String n) {
		BigInteger number = new BigInteger(n);
		for(Long i = 2l; (number.compareTo(new BigInteger(new Long(i*i).toString())) > 0); i++) {
			if(number.mod(new BigInteger(i.toString())).intValue() == 0) {
				System.out.println("not prime");
				return;
			}
		}
		System.out.println("prime");
	}

	public static void main(String[] args) {
		String s = "1987339 1987380 1987411 1987429 1987439 1987451 1987471 1987477 1987481 1987483 1987501 "
				+ "1987519 1987523 1987537 1987543 1987547 1987549 1987577 1987619 1987621 1987649 1987673 "
				+ "1987679 1987681 1987693 1987697 1987703 1987709 1987789 1987819 1987829 1987841 1987849 "
				+ "1987873 1987879 1987883 1987889 1987891 1987901 1987919 1987939 1987969 1987981 1987987 "
				+ "1987991 1988011 1988023 1988033 1988057 1988087 1988089 1988101 1988113 1988137 1988177 "
				+ "1988183 1988197 1988219 1988221 1988227 1988237 1988243 1988249 1988251 1988257 1988263 "
				+ "1988267 1988279 1988291 1988297 1988299 1988323 1988339 1988341 1988347 1988353 1988411 "
				+ "1988423 1988453 1988471 1988513 1988531 1988533 1988537 1988549 1988551 1988561 1988563 "
				+ "1988579 1988587 1988599 1988611 1988633 1988653 1988659 1988669 1988671 1988683 1988689 "
				+ "1988699 1988729 1988759 1988797 1988801 1988807 1988837 1988839 1988843 1988851 1988887 "
				+ "1988891 1988897 1988933 1988941 1988963 1988999 1989007 1989019 1989049 1989059 1989073 "
				+ "1989077 1989101 1989107 1989131 1989133 1989151 1989161 1989193 1989203 1989217 1989233 "
				+ "1989241 1989259 1989263 1989277 1989307 1989329 1989341 1989353 1989401 1989413 1989419 "
				+ "1989479 1989499 1989517 1989551 1989553 1989563 1989571 1989583 1989613 1989619 1989643 "
				+ "1989671 1989679 1989683 1989721 1989769 1989787 1989791 1989803 1989811 1989847 1989863 "
				+ "1989877 1989899 1989919 1989947 1989959 1989961 1989973 1989979 1989989 1990007 1990031 "
				+ "1990033 1990039 1990069 1990081 1990103 1990111 1990123 1990133 1990141 1990147 1990151 "
				+ "1990159 1990171 1990187 1990189 1990211 1990223 1990229 1990237 1990243 1990249 1990253 "
				+ "1990273 1990277 1990279 1990319 1990321 1990327 1990337 1990361 1990379 1990381 1990433 "
				+ "1990441 1990447 1990453 1990463 1990481 1990487 1990493 1990507 1990523 1990529 1990543 "
				+ "1990553 1990559 1990577 1990579 1990607 1990621 1990643 1990657 1990661 1990679 1990691 "
				+ "1990693 1990753 1990759 1990787 1990823 1990829 1990831 1990867 1990871 1990883 1990889 "
				+ "1990907 1990927 1990939 1990951 1990957 1990969 1990973 1990981 1990987 1991027 1991047 "
				+ "1991063 1991071 1991089 1991107 1991123 1991131 1991137 1991147 1991153 1991177 1991189 "
				+ "1991239 1991243 1991251 1991267 1991279 1991281 1991293 1991351 1991357 1991359 1991387 "
				+ "1991389 1991413 1991443 1991449 1991461 1991477 1991489 1991491 1991503 1991519 1991527 "
				+ "1991551 1991573 1991597 1991603 1991609 1991617 1991623 1991641 1991653 1991677 1991681 "
				+ "1991707 1991723 1991729 1991753 1991761 1991779 1991797 1991819 1991837 1991849 1991861 "
				+ "1991863 1991879 1991881 1991893 1991911 1991921 1991929 1991933 1991947 1991959 1991963 "
				+ "1991989 1991993 1991999 1992031 1992041 1992049 1992073 1992079 1992101 1992119 1992139 "
				+ "1992163 1992167 1992181 1992197 1992203 1992227 1992241 1992251 1992257 1992259 1992269 "
				+ "1992299 1992307 1992337 1992343 1992373 1992407 1992409 1992433 1992437 1992439 1992469 "
				+ "1992481 1992493 1992509 1992517 1992527 1992533 1992547 1992563 1992583 1992589 1992611 "
				+ "1992623 1992631 1992637 1992643 1992673 1992691 1992713 1992719 1992733 1992761 1992763 "
				+ "1992769 1992779 1992797 1992803 1992817 1992839 1992841 1992877 1992883 1992889 1992911 "
				+ "1992917 1992919 1992937 1992953 1992971 1992983 1993031 1993037 1993039 1993067 1993087 "
				+ "1993109 1993127 1993151 1993163 1993193 1993217 1993219 1993231 1993237 1993241 1993247 "
				+ "1993259 1993261 1993273 1993289 1993307 1993319 1993339 1993349 1993357 1993363 1993367 "
				+ "1993417 1993441 1993457 1993477 1993483 1993493 1993507 1993513 1993529 1993531 1993553 "
				+ "1993561 1993591 1993601 1993603 1993627 1993631 1993633 1993637 1993643 1993657 1993661 "
				+ "1993679 1993681 1993687 1993697 1993699 1993711 1993729 1993757 1993759 1993763 1993829 "
				+ "1993861 1993877 1993921 1993931 1993933 1993949 1993963 1993969 1993973 1993991 1993997 "
				+ "1994033 1994051 1994053 1994059 1994081 1994087 1994093 1994101 1994119 1994143 1994191 "
				+ "1994203 1994207 1994227 1994299 1994327 1994339 1994341 1994347 1994357 1994381 1994387 "
				+ "1994413 1994429 1994437 1994441 1994459 1994467 1994471 1994477 1994479 1994483 1994497 "
				+ "1994501 1994519 1994521 1994543 1994567 1994569 1994599 1994621 1994623 1994647 1994651 "
				+ "1994659 1994669 1994687 1994711 1994717 1994743 1994777 1994779 1994807 1994827 1994833 "
				+ "1994843 1994869 1994879 1994897 1994911 1994947 1994953 1994959 1994977 1994983 1994989 "
				+ "1995011 1995013 1995023 1995031 1995061 1995073 1995083 1995107 1995109 1995121 1995139 "
				+ "1995143 1995187 1995211 1995221 1995223 1995263 1995271 1995289 1995293 1995311 1995317 "
				+ "1995337 1995349 1995353 1995359 1995391 1995421 1995431 1995449 1995473 1995481 1995517 "
				+ "1995527 1995529 1995533 1995541 1995547 1995583 1995607 1995611 1995629 1995649 1995661 "
				+ "1995677 1995683 1995689 1995691 1995709 1995713 1995727 1995769 1995781 1995787 1995797 "
				+ "1995827 1995841 1995857 1995869 1995883 1995913 1995937 1995947 1995967 1995971 1995977 "
				+ "1995979 1995989 1995991 1996013 1996019 1996061 1996081 1996087 1996091 1996097 1996109 "
				+ "1996129 1996171 1996177 1996207 1996217 1996219 1996223 1996229 1996237 1996277 1996279 "
				+ "1996283 1996289 1996297 1996301 1996303 1996321 1996333 1996343 1996363 1996381 1996391 "
				+ "1996403 1996411 1996417 1996427 1996439 1996453 1996459 1996471 1996481 1996487 1996507 "
				+ "1996517 1996529 1996543 1996549 1996559 1996573 1996583 1996609 1996613 1996639 1996649 "
				+ "1996681 1996697 1996711 1996717 1996721 1996723 1996739 1996751 1996759 1996763 1996777 "
				+ "1996781 1996793 1996817 1996829 1996849 1996859 1996867 1996879 1996901 1996903 1996933 "
				+ "1996937 1996949 1996979 1997003 1997029 1997053 1997057 1997059 1997081 1997087 1997089 "
				+ "1997101 1997111 1997119 1997129 1997137 1997141 1997161 1997173 1997179 1997183 1997189 "
				+ "1997213 1997231 1997243 1997257 1997267 1997269 1997293 1997311 1997321 1997339 1997341 "
				+ "1997351 1997407 1997419 1997431 1997441 1997459 1997467 1997473 1997503 1997507 1997531 "
				+ "1997539 1997543 1997557 1997587 1997591 1997599 1997617 1997647 1997657 1997663 1997683 "
				+ "1997693 1997701 1997707 1997713 1997719 1997731 1997747 1997753 1997771 1997773 1997813 "
				+ "1997833 1997843 1997851 1997867 1997887 1997899 1997903 1997911 1997921 1997939 1997969 "
				+ "1997999 1998019 1998023 1998041 1998049 1998067 1998077 1998089 1998107 1998109 1998119 "
				+ "1998127 1998133 1998169 1998181 1998209 1998221 1998223 1998233 1998251 1998257 1998277 "
				+ "1998289 1998301 1998319 1998329 1998331 1998341 1998343 1998349 1998371 1998379 1998397 "
				+ "1998413 1998427 1998431 1998443 1998449 1998457 1998473 1998497 1998517 1998527 1998533 "
				+ "1998541 1998559 1998569 1998587 1998589 1998611 1998617 1998637 1998641 1998643 1998679 "
				+ "1998691 1998697 1998701 1998727 1998739 1998761 1998793 1998817 1998827 1998839 1998881 "
				+ "1998917 1998923 1998943 1998947 1998949 1998961 1998977 1998991 1999007 1999021 1999033 "
				+ "1999043 1999061 1999069 1999099 1999103 1999111 1999121 1999163 1999177 1999187 1999211 "
				+ "1999219 1999223 1999243 1999247 1999273 1999297 1999301 1999303 1999307 1999331 1999339 "
				+ "1999343 1999363 1999379 1999423 1999441 1999471 1999499 1999511 1999513 1999537 1999549 "
				+ "1999559 1999561 1999567 1999603 1999607 1999619 1999631 1999633 1999651 1999661 1999667 "
				+ "1999681 1999691 1999703 1999721 1999733 1999771 1999799 1999817 1999819 1999853 1999859 "
				+ "1999867 1999871 1999889 1999891 1999957 1999969 1999980 1999993"; 
		String[] primes = s.split(" ");
		for(String str: primes) {
			isPrime(str);
		}
		System.out.println(new BigInteger("6513516734600035718300327211250928237178281758494417357560086828416863929270451437126021949850746381").isProbablePrime(100));
	}

}