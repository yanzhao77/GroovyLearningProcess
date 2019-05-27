package groovy

class UsingCillection1111 {
    public static void main(String [] args){
        ArrayList<String> lst=new ArrayList<>();
        Collection<String> col=lst;
        lst.add("one");
        lst.add("two");
        lst.add("three");
        col.remove(0);
        lst.remove(0);
        System.out.println("Added three items,removed two,so 1 item to remain");
        System.out.println("Number of elements is:"+lst.size());
        System.out.println("Number of elements is:"+col.size());


    }

}