public class SquareofNum {
    int SquareNum(int side){
        int ans = side*side;
        return ans;
    }

    public class ClientSquare{
        public static void main(String[] args){
            SquareofNum c = new SquareofNum();
            int side = 5;
           
            
            int ss = c.SquareNum(10);
            System.out.println(ss);

        }
    }
}

