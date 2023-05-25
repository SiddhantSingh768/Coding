public class FriendsPairingProblem{
    public static int FriendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        return FriendsPairing(n-1)+(n-1)*FriendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(FriendsPairing(3));
    }
}