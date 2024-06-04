package leetcode.greed.top100liked;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {
    public int maxProfit_nest_loop(int[] prices) {
        int maxProfit = 0;
        int lowPrice = Integer.MAX_VALUE;
        for (int i = 0; i< prices.length-1; i++) {
            if (prices[i] < lowPrice) {
                lowPrice = prices[i];
            } else {
                continue;
            }
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices [i]) {
                    maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
                }
            }
        }
        return maxProfit;
    }

    public int maxProfit_1(int[] prices) {
        List<Integer> maxProfitList = new ArrayList<>();
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] > minPrice) {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            } else if (prices[i] < minPrice){
                minPrice = prices[i];
                maxProfitList.add(maxProfit);
                maxProfit = 0;
            }
        }

        for (Integer i : maxProfitList) {
            if(i > maxProfit) {
                maxProfit = i;
            }
        }

        return maxProfit;
    }

//    int baseMaxFindMin(int[] prices) {
//        int maxIndex = 0;
//        int maxPrice = Integer.MIN_VALUE;
//        for (int i = 0; i < prices.length - 1; i ++) {
//            if (prices[i] > maxPrice) {
//                maxIndex = i;
//                maxPrice = prices[i];
//            }
//        }
//
//        int minIndex = 0;
//        int minPrice = Integer.MAX_VALUE;
//        for(int i = 0; i <= maxIndex; i ++) {
//            if (prices[i] < minPrice) {
//                minIndex = i;
//                minPrice = prices[i];
//            }
//        }
//
//        return maxPrice - minPrice;
//    }
//
//    int baseMinFindMax(int[] prices) {
//        int minIndex = 0;
//        int minPrice = Integer.MAX_VALUE;
//        for(int i = 0; i < prices.length; i ++) {
//            if (prices[i] < minPrice) {
//                minIndex = i;
//                minPrice = prices[i];
//            }
//        }
//
//        int maxIndex = minIndex;
//        int maxPrice = Integer.MIN_VALUE;
//        for (int i = minIndex ; i < prices.length; i ++) {
//            if (prices[i] > maxPrice) {
//                maxIndex = i;
//                maxPrice = prices[i];
//            }
//        }
//
//        return maxPrice - minPrice;
//    }


}
