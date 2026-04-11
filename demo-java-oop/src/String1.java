public class String1 {
  private char[] chs;

  public String1() {
    this.chs = new char[0];
  }

  public String1(String stringInput) {
    this.chs = new char[stringInput.length()];
    int idx = 0; // create a new index instead of using i (although using i here is ok as both
                 // values are the same in this case but best practice is to create a new index)
    for (int i = 0; i < stringInput.length(); i++) {
      this.chs[idx++] = stringInput.charAt(i);
    }
  }

  public char charAt(int index) {
    return this.chs[index];
  }

  public int length() {
    return this.chs.length;
  }

  // public String replace(char input, char replaced) {
  // for (int i = 0; i < this.chs.length; i++) {
  // if (this.chs[i] == input) {
  // this.chs[i] = replaced;
  // }
  // }
  // return String.valueOf(this.chs);
  // }

  public String replace(char input, char replaced) {
    String newStr = "";
    for (int i = 0; i < this.chs.length; i++) {
      if (this.chs[i] != input) {
        newStr += this.chs[i];
      } else {
        newStr += replaced;
      }
    }
    return newStr;
  }

  public int indexOf(char target) {
    int idx = -1;
    for (int i = 0; i < this.chs.length; i++) {
      if (this.chs[i] == target) {
        idx = i;
        break;
      }
    }
    return idx;
  }

  public static void main(String[] args) {
    String1 str = new String1("hello");

    System.out.println(str.length()); // 5
    System.out.println(str.charAt(0)); // h
    System.out.println(str.replace('l', 'x'));
    System.out.println(str.indexOf('l'));

  }
}
