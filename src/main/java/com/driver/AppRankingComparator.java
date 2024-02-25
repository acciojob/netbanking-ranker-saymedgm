package com.driver;

import java.util.Comparator;

public class AppRankingComparator implements Comparator<NetBankingApp> {
	public int compare(NetBankingApp app1, NetBankingApp app2) {
		int compareSecurity = Integer.compare(app2.getSecurityRating(), app1.getSecurityRating());
		if (compareSecurity != 0) return compareSecurity;

		int compareFriendliness = Integer.compare(app2.getUserFriendliness(), app1.getUserFriendliness());
		if (compareFriendliness != 0) return compareFriendliness;

		return Integer.compare(app2.getNumOfFeatures(), app1.getNumOfFeatures());
	}
}