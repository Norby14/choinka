class Main {
  public static void main(String[] args) {
    String znakChoinki = "*";
		for (int x=1; x<51; x=x+2)
			{
				for (int y=1; y<51; y++)
					{
						if (y<(51-x))
						{
								System.out.print(" ");
						}
						else
						{
							System.out.print(" "+znakChoinki);
						}
					}
				System.out.println();
			}
  }
}
