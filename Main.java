class Main {
  public static void main(String[] args) {
    String znakChoinki = "9";
		for (int x=1; x<20; x++)
			{
				for (int y=1; y<20; y++)
					{
						if (y<(20-x))
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
