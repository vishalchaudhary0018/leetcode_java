class ArrayRevision{

   void AnonymousArray(int v []){
System.out.println(v[0]);
System.out.println(v[1]);
System.out.println(v[2]);
   }
   public static void main(String[] args) {

// array declaration
      int[] arr;      // recommended
      String s[];
      float []f;
//======================================
      int []a,b; // both are array type
      int x [], z;// x--array type, z-- normal int

//=============================================
 
int []  ar=new int[5]; // size must hai

// 2D-array creation
String[][] str=new String[3][]; // size must hai
  

// 3D-array creation
String[][][] st=new String[4][][]; // size must hai

//=====================================================

// array initialization
ar[0]=10;
ar[1]=20;
ar[2]=30;
ar[3]=40;
ar[4]=50;
System.out.println(ar[1]);

//=====================================
//array declaration + array creation + array initialization in single line 

// 1D-array creation
int [] arrr={12,13,14,15,16};
// 2D-array creation
String [][] stri={{"vishal","raja","rani"},{"apple","banana","mango","papaya"}}; // size can different of 1-D array

// 3D-array creation
int [][][] arrrr={{{1,2,3},{4,5},{6,7,8}},{{9,10},{11,12,13}},{{14,15,16},{17,18}}};

//================================================
//lenght  vs lenght()
System.out.println( arrr.length);

System.out.println(stri[0][1].length());

//=================================================
//type compatibility(array element assignment)
      byte k=10;
      short c=76;
      double [] d={ 12,'a',12345L,6.7, c,k};
// array traverse(for each loop)
      for (double v: d) {
         System.out.println(v);
      }
//=============================================

//array variable  assignment(ye keval same data type ke liye valid h )
int [] h={1,2,3,4,5};
int [] j={6,7,8,9};
j=h;    // j array distroy ho jati h or j var h var both h array ko refer krne lagta h 
System.out.println(j[0]);
System.out.println(j[1]);
System.out.println(h[0]);
//===============================
// anonymous Array
  ArrayRevision A=new ArrayRevision();
A.AnonymousArray(new int[]{10,12,13,14,15});

   }

}