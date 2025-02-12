public class Gee17{
  public static void main(String[] args){
    int[][] ray = new int[7][7];

    //populate the array with sequential numbers
    int num = 1;

    for(int i = 0; i < ray.length; i++)
    {
      for(int j = 0; j < ray[0].length; j++)
      {
        ray[i][j] = num;
        num++;
      }
    }
    
    ArrayAverages TwoDee = new ArrayAverages(ray);

    System.out.println(TwoDee);
    TwoDee.rowAverages();
    TwoDee.columnAverages();
    TwoDee.arrayAverage();
  }
}
