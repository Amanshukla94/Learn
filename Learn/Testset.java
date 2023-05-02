public int Testset()
{
  int duplicates = 0;

  for ( int i = 0; i < strings.size(); i++ )
  {
     for ( int j = 0; j < strings.size(); j++ )
     {
        if ( i == j )
        {
          // i & j refer to same entry so do nothing
        }

        else if ( strings.get( j ).equals( strings.get( i ) ) )
        {
           strings.remove( j );
           duplicates++;
        }
     }
 }

   return duplicates;
}