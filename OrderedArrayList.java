import java.util.*;

public class OrderedArrayList{

    ArrayList<Integer> _info = new ArrayList<Integer>();

    public boolean add( int e ){

        if(_info.size() == 0){
            _info.add(e);
            return true;
        }else{
            for(int i = 0; i < _info.size(); i++){

              Integer indexV = _info.get(i);

              if(indexV.compareTo(e) == 0){
                  _info.add(i+1, e);
                  return true;
              }
            }
            int j = 0;
            while(_info.get(j).compareTo(e) < 0){
                j++;
                if(j == _info.size()){
                  _info.add(e);
                  return true;
                }
            }
            _info.add(j,e);
            return true;
        }
    }
}
