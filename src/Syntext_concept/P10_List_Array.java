package Syntext_concept;


import java.util.ArrayList;
import java.util.Arrays;

public class P10_List_Array {
    public static void main(String[] args) {
        //--------------Object declare--------------


        P10_List_Array o=new P10_List_Array();
        ArrayList<String> color=o.createArrayList();
        o.addList(color);
        o.printlist(color);
        o.setList(color,0,"Orange");
       // o.printlist(color);
        o.searchFromlist(color,"Red");
       // o.printlist(color);
       o.removeFromList(color,"yellow");
      // o.printlist(color);



    }

    public ArrayList createArrayList(){
        System.out.println("-------- Create list function ------------------");
        //--------------Object declare--------------
        ArrayList<String> color=new ArrayList<String>();


        return color;

    }
    public void addList(ArrayList<String> color){
        System.out.println("-------- add list" +
                "" +
                "" +
                "   " +
                " function ------------------");
        //---------initialization----------------
        color.add("green");
        color.add("Red");
        color.add("yellow");
        color.add("Blue");
    }
    public void printlist(ArrayList<String> color){
        System.out.println("-------- Print function ------------------");

        System.out.println(color); //out put:[green, Red, yellow, Blue]

       //----------------Other way print total -------------------------
//        for (int x=0; x<color.size();x++) {
//
//                System.out.println(color.get(x)+" ");
//
//        }
        //----------------Print total list-------------
        for( String x: color){
            System.out.print(x+" ");
        }


        //-------------------------get a specific single value by index--------------------
        System.out.println();
        System.out.println(color.get(0));//green

    }

    public void setList(ArrayList<String> color,int index,String value){
        System.out.println("-------- Set function ------------------");
        //-------------------------Set a specific single value by index--------------------
        color.set(index,value);
    }

    public void removeFromList(ArrayList<String> color, String value){
        System.out.println("-------- Remove function ------------------");
        for (int x=0; x<color.size();x++) {

            if(color.get(x)==value){
                color.remove(x);
                System.out.println(value+ "has removed from index : "+x);
            }
        }

    }

    public void searchFromlist(ArrayList<String> color,String value){
        System.out.println("-------- search function ------------------");
        for (int x=0; x<color.size();x++) {

            if(color.get(x)==value){

                System.out.println(value+ " has has been found in the index of: "+x);
            }
        }

    }
    public void stringToList(){
        System.out.println("-------- String to ArrayList function ------------------");
        //=========================== String to list=============================
        String s = "lorem,ipsum,dolor,sit,amet";

        ArrayList<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));

        System.out.println(myList.get(2)); //OutPut: dolor
        System.out.println(myList); //out put: [lorem, ipsum, dolor, sit, amet]
    }

    public void ImportenFunctionForList(ArrayList<String> color){

        //---------------------Remove a specific value from by index-----------
        color.remove(1);
        //----------------------list size--------------------
        color.size();
        //--------------Clear list---------------------
        color.clear();
    }

    public void margeArrayList(){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("2");

        ArrayList<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        System.out.println(mergedList); // [1, 2]
    }
}
