public class variables{
    public static void main(String []args){

        // Single Line Comment
        /* Multi Line Comment */
        /** JavaDoc Comment */


/*       Data Types:each data types has its own memory block for which it can store the data accordingly

        1) Primitive data types: This are basic built-in data types that store single simple values direct in memory, they are fast,memory-efficient.
            example: byte,short,int,long,float,double,char,boolean
*/

        int age = 20;
        byte roll = 128; //lies from -127 to 128 
        short num = 4568;
        char grade = 'A';
        double price = 99.9; 
        long number = 123984932; //long memory is allocated to store the data
        float cgpa = 8.56f; //the f literal is must at last of value because without f the float value is treated as double
        boolean isPass = true; //by default boolean is false

/*
        2) Non-Primitive data types: This are of complex types that stores refernces to objects instead of actual values
            example: String,Array,Class,Object,Interface,List,Map
*/


/*     Type Conversion or Type Casting: Converting of one data type or storing one data type variable into another data type of variable

       1)Implicit Type Casting/ Widening Casting: This is autoamtic type of conversion it happens when a smaller value is converted or stored in another varibale which is larger than that, as its larger there is no data loss the data is stored as it is think of like two buckets of water ine is small and other is big so we can easily store the smaller bucket water in bigger bucket if the bigger bucket has the capacity to store otherwise if empty it can store it easily,

       the conversion can happen in this order:
       byte->short->int->long->float->double
 */ 
        int x = 10;
        double y = x; // here the conversion handled automatically we only store int to double because the double has larger capacity than int

/*      2) Explicit Type Casting/ Narrowing casting: This are manual casting where the programmer forcefully type caste/ convert the data type because 
           by default the java doesnt allow to convert larger value into smaller because it creates data loss, from above example of bucket think we transfered the water from bigger bucket which is full to smaller bucket then the water will overflow from smaller bucket and hence the same happens here which causes the replace of any value from origihnal data    
*/
        int a = 130;
        byte b = (int)a;

    }
}