

/*****************************************************
  * Team Turtle Hats
  * Jacob Ng Kevin Cheng Hamim Seam
  * APCS
  * L02: Well Al B. Sorted
  * 2021-12-11
  * Time spent: hrs
  *****************************************************/

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 * (SKELETON)
 **********************************************/

import java.util.*;
import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
	_data = new ArrayList();
  }

  public String toString()
  {
    String arrayString = "[";
		for ( Integer num : _data ) arrayString += num + " ,";
		arrayString += "]";
		return arrayString;
  }

  public Integer remove( int i )
  {
	Integer Value = _data.get(i);
	_data.remove(i);
	return Value;
  }

  public int size()
  {
    return _data.size();
  }

  public Integer get( int i )
  {
        return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
    
	if(_data.size() == 0){
            _data.add(newVal);
            return;
        }else{
            for(int i = 0; i < _data.size(); i++){

              Integer indexV = _data.get(i);  //got a deprecated api note when I used new Integer

              if(indexV.compareTo(newVal) == 0){
                  _data.add(i+1, newVal);
                  return;
              }
            }
            int j = 0;
            while(_data.get(j).compareTo(newVal) < 0){
                j++;
                if(j == _data.size()){
                  _data.add(newVal);
                  return;
                }
            }
            _data.add(j, newVal);
         }
    }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
        
	if (_data.size() == 0){
		_data.add(newVal);
		return;
	}
	else {
		for (int i = 0; i < _data.size(); i++){

              Integer indexV = _data.get(i);  //got a deprecated api note when I used new Integer

              if(indexV.compareTo(newVal) == 0){
                  _data.add(i+1, newVal);
                  return;
              }
              
            int middle = _data.size()/2;
            if ( newVal.compareTo(_data.get(middle)) > 0) {
        	    int j = middle;
        	    while ( newVal.compareTo(_data.get(j)) > 0) {
        	        j++;
        	        if ( j == _data.size() ){
        		       _data.add(newVal);
        		       return;
        		    }
                }
                _data.add(j, newVal);
                return;
            }
            if ( newVal.compareTo(_data.get(middle)) < 0) {
        	    int j = middle;
        	    while ( newVal.compareTo(_data.get(j)) < 0) {
        	        j--;
        	        if ( j < 0 ){
        		      _data.add(0, newVal);
        		      return;
        		    }
                }
                _data.add(j+1, newVal);
                return;
            }   
        }
   }
 }	
    

  // main method solely for testing purposes
  public static void main( String[] args )
  {
    
    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ ){
      Franz.addLinear( (int)( Math.random()*50) );
    }
     System.out.println( Franz );

    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ ) 
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
          /*-----v-------move-me-down-----------------v--------
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
