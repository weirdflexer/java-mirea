public class GenericStack<E> {
  @SuppressWarnings("unchecked")
  private E[] list = (E[]) new Object[1];
  private int index = 0;

  public int getSize() {
    return list.length;
  }

  public E peek() {
    return list[index-1];
  }

  public void push(E o) {
    if (this.index < this.getSize()) {
      list[this.index] = o;
      this.index++;
    } else {
      @SuppressWarnings("unchecked")
      E[] buff = (E[]) new Object[this.getSize()*2];

      for (int i = 0; i < index; i++) {
        buff[i] = this.list[i];
      }

      this.list = buff;
      buff[this.index] = o;
      this.index++;
    }
  }

  public E pop() {
    E o = this.list[this.index - 1];
    this.list[index - 1] = null;
    this.index--;
    return o;
  }

  @Override
  public String toString() {
    String result = "[";

    for (int i = 0; i < this.getSize() - 1; i++) {
      if(this.list[i] != null) {
        result += (String) list[i] + ", ";
      }
    }

    result += "]";
    return result;
  }
}