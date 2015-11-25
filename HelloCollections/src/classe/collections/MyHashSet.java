package classe.collections;

import java.util.*;

public class MyHashSet
{
public static void main( String[] args )
  {
  HashSet<Integer> set = new HashSet<Integer>();
  set.add( new Integer( 6 ) );
  set.add( new Integer( 1 ) );
  set.add( new Integer( 4 ) );
  System.out.println( set );
  
  
  System.out.println();

  System.out.println( "Enumerate the HashSet" );
  Iterator<Integer> e = set.iterator(); 
  while ( e.hasNext() )
    System.out.println( e.next() );
  System.out.println();

  boolean exist=set.contains( new Integer (1));
        
  System.out.println("Number 1 exists: "+ exist);
   exist=set.contains( new Integer (10));
  
  System.out.println("Number 10 exists: "+ exist);
  
  
  HashSet<Integer> set2 = new HashSet<Integer>();
  set2.add( new Integer( 6 ) );
  set2.add( new Integer( 1 ) );
  set2.add( new Integer( 40 ) );

  HashSet<Integer> intersection = new HashSet<Integer>( set );
  intersection.retainAll(set2);
  e = intersection.iterator();
  for (Iterator<Integer> i = intersection.iterator() ; i.hasNext(); )
    System.out.println( i.next() );
  System.out.println();

  }
}