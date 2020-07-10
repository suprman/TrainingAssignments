class HappyString
{
    public String longestDiverseString(int a, int b, int c)
    {
        
        int[] count = new int[] {a, b, c};
        StringBuilder s = new StringBuilder();

        int prev = -1, prevPrev = -1;
        while (true) 
        {
          int max = 0, idx = -1;

            for (int i = 0; i < 3; i++) 
          {
            if (count[i] > max && !(prev == i && prevPrev == i) ) 
            {
              max = count[i]; idx = i;
            }
        }

            if (max == 0) break;
            s.append((char)('a' + idx));
            --count[idx];
            prevPrev = prev; prev = idx;
        }
    
        return s.toString();
    }
}