import java.util.*;

public class OrderedArrayList{

    ArrayList<Integer> _data = new ArrayList<Integer>();  //got a deprecated api note when I forgot the <Integer> part

    public boolean add( int e ){

        if(_data.size() == 0){
            _data.add(newVal);
            
        }else{
            for(int i = 0; i < _data.size(); i++){

              Integer indexV = _data.get(i);  //got a deprecated api note when I used new Integer

              if(indexV.compareTo(newVal) == 0){
                  _data.add(i+1, e);
                  
              }
            }
            int j = 0;
            while(_data.get(j).compareTo(newVal) < 0){
                j++;
                if(j == _data.size()){
                  _data.add(newVal);
                  
                }
            }
            _data.add(j,e);
            
        }
    }
}

// Clyde "Thluffy" Sinclair
// APCS pd00
// Lab02
// 2021-12-13

/**********************************************
 * class OrderedArrayList
 * wrapper class for ArrayList
 * maintains invariant that elements are ordered (ascending)
 * (SKELETON)
 **********************************************/


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
	ArrayList<Integer> _data = new ArrayList<Integer>();
  }

  public String toString()
  {

  }

  public Integer remove( int i )
  {
	
  }

  public int size()
  {

  }

  public Integer get( int i )
  {

  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
	if(_data.size() == 0){
            _data.add(newVal);
            
        }else{
            for(int i = 0; i < _data.size(); i++){

              Integer indexV = _data.get(i);  //got a deprecated api note when I used new Integer

              if(indexV.compareTo(newVal) == 0){
                  _data.add(i+1, newVal);
                  
              }
            }
            int j = 0;
            while(_data.get(j).compareTo(newVal) < 0){
                j++;
                if(j == _data.size()){
                  _data.add(newVal);
                  
                }
            }
            _data.add(j, newVal);
            
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
	if (_data.size() == 0)
		_data.add(newVal);
	else {
		for (int i = 0; i < _data.size(); i++){

              Integer indexV = _data.get(i);  //got a deprecated api note when I used new Integer

              if(indexV.compareTo(newVal) == 0){
                  _data.add(i+1, newVal);
              }
              
        int middle = _data.size()/2;
        if ( newVal > _data.get(middle) ) {
        	int j = _data.size() - middle;
        	while ( _data.get(j).compareTo(newVal) < 0 ) {
        	if ( j == _data.size() )
        		_data.add(newVal)
        		
            }
  }	

  // main method solely for testing purposes
  public static void main( String[] args )
  {
    /*-----v-------move-me-down-----------------v--------
    OrderedArrayList Franz = new OrderedArrayList();
    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
    // testing binary search
    Franz = new OrderedArrayList();
    for( int i = 0; i < 15; i++ ) 
      Franz.addBinary( (int)( 50 * Math.random() ) );
    System.out.println( Franz );
      =====^====================================^=========*/

  }//end main()

}//end class OrderedArrayList
