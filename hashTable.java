import java.util.*;
import java.io.*;
class HashTable
{
public static void main(String[] args) throws IOException
{
int key;
try
{
BufferedReader in = new BufferedReader
(new InputStreamReader(System.in));
System.out.print
("How many elements you want to enter to the hash table : ");
int n = Integer.parseInt(in.readLine());
Hashtable<Integer, String> hashTable = new
Hashtable<Integer, String>();
for(int i = 0; i < n; i++)
{
System.out.print("Enter key for the hash table : ");
key = Integer.parseInt(in.readLine());
System.out.print("Enter value for the key : ");
hashTable.put(key, in.readLine());
}
Map<Integer, String> map = new
TreeMap<Integer, String>(hashTable);
System.out.println(map);
}
catch(NumberFormatException ne)
{
System.out.println(ne.getMessage() + " is not a legal value.");
  System.out.println("Please enter a numeric value.");
System.exit(1);
}
}
}//End
