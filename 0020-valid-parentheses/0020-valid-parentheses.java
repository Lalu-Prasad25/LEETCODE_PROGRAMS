class Solution {
    public boolean isValid(String s) {
        
        LinkedList<Character> l= new LinkedList();
        
        for(Character i :s.toCharArray()){
            if(i == '(' || i=='{' || i =='['){
                l.addLast(i);
            }else if(l.size()!=0 && l.peekLast() == '(' && i == ')'){
                l.removeLast();
            }else if(l.size()!=0 && l.peekLast() == '{' && i == '}'){
                l.removeLast();
            }else if(l.size()!=0 && l.peekLast() == '[' && i == ']'){
                l.removeLast();
            }else{
                return false;
            }
        }

            if(l.size()!=0){
                return false;
            }
            return true;
        
    }
}