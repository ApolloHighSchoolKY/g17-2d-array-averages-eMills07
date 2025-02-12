import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

public void rowAverages()
  {
  
  for(int[] row: ray)
  {
    double sum = 0;
    for(int col: row)
    {
      sum += col;
    }
    System.out.println(sum/ray[0].length);
  }  
  
  }

  public void columnAverages()
  {
    int[] colSum = new int[ray.length];
    for(int[] row: ray)
  {
    int colTracker = 0;
    for(int col: row)
    {
      colSum[colTracker] += col;
      colTracker++;
    }
    
  }
  for(double i: colSum)
  {
    System.out.println(i/ray.length);
  }  
  }

  public void arrayAverage()
  {
    double sum = 0;
    for(int[] row: ray)
  {
    
    for(int col: row)
    {
      sum += col;
    }
  }  
  System.out.println(sum/(ray.length*ray.length));
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
  return "";
  }
}
