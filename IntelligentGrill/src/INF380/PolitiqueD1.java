package INF380;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> master
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

<<<<<<< HEAD
=======
public class PolitiqueD1 extends PolitiqueD{
	
	int pTotal;
	List<Integer>c_o;
	List<Integer>c_c;
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();  
	//Map<Integer,Integer> mapco=new HashMap<>();  
	public PolitiqueD1(){
		
		
	}
	protected Comparator<Integer> comparator(){
		return new Comparator<Integer>(){
			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				if(map.get(arg0)>map.get(arg1)){
					return -1;
				}
				else if(map.get(arg0)<map.get(arg1)){
					return 1;
				}
				else{
					return 0;
					//return arg0.compareTo(arg1);
				}
			}
			
		};
		
	}
	
	 private static HashMap sortByValues(HashMap map) { 
	       List list = new LinkedList(map.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o1)).getValue())
	                  .compareTo(((Map.Entry) (o2)).getValue());
	            }
	       });

	       // Here I am copying the sorted list in HashMap
	       // using LinkedHashMap to preserve the insertion order
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap;
	  }
	
	
	
	
	public void distribuer(int pTotal, List<Integer>c_o,List<Integer>c_c){
		
		
		//Collections.sort(c_c);
		//Collections.sort(c_o);
		int n = c_c.size();
		for(int i=0;i<n;i++){
			map.put(i, c_c.get(i));
		}
		Map<Integer, Integer> maps = sortByValues(map); 

		
		
		for(int i:map.keySet()){
			if(pTotal>=c_c.get(i)){
				c_c.set(i, 0);
				pTotal = pTotal - c_c.get(i);
			}
			else if(c_c.get(i)>pTotal&&pTotal>=0){
				c_c.set(i, c_c.get(i)-pTotal);
			}
			else{
				break;
			}
		}
		for(int i=0;i<n;i++){
			if(pTotal>=c_o.get(i)){
				c_o.set(i, 0);
				pTotal = pTotal - c_o.get(i);
			}
			else if(c_o.get(i)>pTotal&&pTotal>=0){
				c_o.set(i, c_o.get(i)-pTotal);
			}
			else{
				break;
			}
		}
		
	}
	
	public int getPT(){
		return pTotal;
	}
	public List<Integer> getCC(){
		return c_c;
	}
	public List<Integer> getCO(){
		return c_o;
	}
	
	
=======
>>>>>>> master
public class PolitiqueD1 extends PolitiqueD{
	
	int pTotal;
	List<Integer>c_o;
	List<Integer>c_c;
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();  
	//Map<Integer,Integer> mapco=new HashMap<>();  
	public PolitiqueD1(){
		
		
	}
	protected Comparator<Integer> comparator(){
		return new Comparator<Integer>(){
			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				if(map.get(arg0)>map.get(arg1)){
					return -1;
				}
				else if(map.get(arg0)<map.get(arg1)){
					return 1;
				}
				else{
					return 0;
					//return arg0.compareTo(arg1);
				}
			}
			
		};
		
	}
	
	 private static HashMap sortByValues(HashMap map) { 
	       List list = new LinkedList(map.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o1)).getValue())
	                  .compareTo(((Map.Entry) (o2)).getValue());
	            }
	       });

	       // Here I am copying the sorted list in HashMap
	       // using LinkedHashMap to preserve the insertion order
	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap;
	  }
	
	
	
	
	public void distribuer(int pTotal, List<Integer>c_o,List<Integer>c_c){
		this.pTotal = pTotal;
		
		//Collections.sort(c_c);
		//Collections.sort(c_o);
		int n = c_c.size();
		for(int i=0;i<n;i++){
			map.put(i, c_c.get(i));
		}
		Map<Integer, Integer> maps = sortByValues(map); 

		
		
		for(int i:maps.keySet()){
			if(this.pTotal>=maps.get(i)){
				maps.replace(i, 0);
				this.pTotal = this.pTotal - maps.get(i);
			}
			else if(maps.get(i)>this.pTotal&&this.pTotal>=0){
				maps.replace(i, maps.get(i)-this.pTotal);
				//c_c.set(i, c_c.get(i)-pTotal);
			}
			else{
				break;
			}
		}
		
		for(int i=0;i<n;i++){
			c_c.set(i, maps.get(i));
		}
		
		
		
		
		
		
		map.clear();
		for(int i=0;i<n;i++){
			map.put(i, c_o.get(i));
		}
		Map<Integer, Integer> maps1 = sortByValues(map); 

		
		
		for(int i:maps1.keySet()){
			if(this.pTotal>=maps1.get(i)){
				maps1.replace(i, 0);
				this.pTotal = this.pTotal - maps1.get(i);
			}
			else if(maps1.get(i)>this.pTotal&&this.pTotal>=0){
				maps1.replace(i, maps1.get(i)-this.pTotal);
				//c_c.set(i, c_c.get(i)-pTotal);
			}
			else{
				break;
			}
		}
		for(int i=0;i<n;i++){
			c_o.set(i, maps1.get(i));
		}
		
		
		/*for(int i=0;i<n;i++){
			if(pTotal>=c_o.get(i)){
				c_o.set(i, 0);
				pTotal = pTotal - c_o.get(i);
			}
			else if(c_o.get(i)>pTotal&&pTotal>=0){
				c_o.set(i, c_o.get(i)-pTotal);
			}
			else{
				break;
			}
		}*/
		
	}
	
	public int getPT(){
		return pTotal;
	}
	public List<Integer> getCC(){
		return c_c;
	}
<<<<<<< HEAD
	public List<Integer> getCO(){
		return c_o;
	}
	
	
=======
>>>>>>> bd2e3f7dd8119bf8ab9d4368d3b56ea3f0872c09
>>>>>>> master

}
