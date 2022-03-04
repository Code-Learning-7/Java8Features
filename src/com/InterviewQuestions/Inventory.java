//package InterviewQuestions;
//
//import java.util.*;
//import java.util.Map.Entry;
//
////public class Inventory {
////    // DO NOT write a main method
////
////    public static String productValues (Inventory[] items) {
////        Map<String, Integer>    invCountByCode = new TreeMap<String, Integer> ();
////        StringBuffer            result = new StringBuffer ();
////        
////        for (Inventory item : items)
////        {
////            If (!invCountByCode.containsKey(item.product)
////            {
////                invCountByCode.put(item.product, 0);
////            }
////            
////            Integer prevLevel = invCountByCod.get(item.product)
////            
////            invCountByCode.put(item.product, prevLevel + item.qty);
////        }
////
////        for (String prodId : invCountByCode.keySet ())
////        {
////            result.append (prodId).append (",").append(invCountByCode.get(prodId)) + "
////";
////        }
////        
////        return toString result ;
////    }
////    
////    
////    public static class Inventory {
////        public String   product;
////        public int      qty;
////
////        public Inventory(String product, int qty) {
////            this.product = product;
////            this.qty = qty;
////        }
////
////        
////        @Override
////        public String toString() {
////            return qty + " * " + product;
////        }
////    }
////}
////
////
////
////
////
////package test2;
//
//import java.util.*;
//
//
//public class Inventory {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int size;
//		System.out.println("Enter the number of size of array");
//		size = sc.nextInt();
//		String [] a = new String[size];
//		System.out.println("Enter the array element");
//		// For reading the element
//		for (int i = 0; i < size; i++) {
//			a[i] = sc.nextLine();
//		}
//		// For print the array element
//		Map<String, Integer> map = new HashMap<>();
//		for (String item : a) {
//			map.put(item, map.containsKey(item) ? map.get(item) + 1 : 1);
//		}
//
//		// System.out.println(map);
//
//		for (Entry<String, Integer> entry : map.entrySet()) {
//			if (entry.getValue() > 1) {
//				System.out.println(
//						"The  repeated number is " + entry.getKey() + " repeated " + entry.getValue() + " times");
//
//			}
//		}
//
//	}
//
//}
//
//
//
//
//------------------------------------
//
//package test2;
//
//import java.util.*;
//
//
//public class Test2 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int size;
//		System.out.println("Enter the number of size of array");
//		size = sc.nextInt();
//		String [] a = new String[size];
//		System.out.println("Enter the array element");
//		// For reading the element
//		for (int i = 0; i < size; i++) {
//			a[i] = sc.nextLine();
//		}
//		// For print the array element
//		Map<String, Integer> map = new HashMap<>();
//		for (String item : a) {
//			map.put(item, map.containsKey(item) ? map.get(item) + 1 : 1);
//		}
//
//		// System.out.println(map);
//
//		for (Entry<String, Integer> entry : map.entrySet()) {
//			if (entry.getValue() > 1) {
//				System.out.println(
//						 entry.getKey() + " , " + entry.getValue() );
//
//			}
//		}
//
//	}
//
//}
//
