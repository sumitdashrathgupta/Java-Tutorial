class p2{

public static void main(String[] args){

int i=2;
int j=3;
int k=i++ - j++;
System.out.println(i++ + k++ * j++ - k++);
System.out.println(i);
System.out.println(j);
System.out.println(k);
}
}