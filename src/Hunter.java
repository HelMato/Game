public class Hunter {
    int[] hunterfields;
    int rightguessfield;

    public void sethunterfields(int[] hunterfields) {
        this.hunterfields = hunterfields;
    }

    public String check(String shot) {
        int guess = Integer.parseInt(shot);
        String result = "Oh no, you missed him:( Try again!";
        for (int field : hunterfields) {
            if (guess == field) {
                result = "Great, you got him one time! Next shot!";
                rightguessfield++;
                break;
            }
        }
        if (rightguessfield == hunterfields.length) {
            result = "Congrats! You killed the Hunter!";
        }
        System.out.println(result);
        return result;
    }
}