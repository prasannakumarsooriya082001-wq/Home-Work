import java.util.Scanner;

class SpotifyApp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Spotify Music App");
		System.out.println("A R Rahman -> 1 ");
		System.out.println("Anirudh -> 2 ");
		System.out.println("Yuvan Shankar Raja ->3 ");
		
		System.out.print("Select the Music Director : ");
		int musicDirector = sc.nextInt();
		
		switch (musicDirector) 
		{
			case 1 : 
			{
				System.out.println("You Selected A R Rahman Music");
				System.out.println("Music Type : ");
				System.out.println("Melody -> 1");
				System.out.println("Folk -> 2");
				
				System.out.print("Enter the Music Type : ");
				int musicType = sc.nextInt();
				
				if(musicType == 1)
				{
					System.out.println("You Selected Melody Songs");
					System.out.println("Neethanae Neethanae -> 1");
					System.out.println("Munbe Vaa -> 2");
					
					System.out.print("Enter the Song : ");
					int song = sc.nextInt();
					
					if(song == 1)
					{
						System.out.println("Now Playing : Neethanae Neethanae");
					}
					else if (song == 2)
					{
						System.out.println("Now Playing : Munbe Vaa");
					}
					else
					{
						System.out.println("Invalid Song Selection");
					}
				}
				else if(musicType == 2)
				{
					System.out.println("You Selected Folk Songs");
					System.out.println("Aalaporaan Thamizhan -> 1");
					System.out.println("Uppu Karuvaadu -> 2");
					
					System.out.print("Enter the Song : ");
					int song = sc.nextInt();
					
					if(song == 1)
					{
						System.out.println("Now Playing : Aalaporaan Thamizhan");
					}
					else if (song == 2)
					{
						System.out.println("Now Playing : Uppu Karuvaadu");
					}
					else
					{
						System.out.println("Invalid Song Selection");
					}
				}
				else
				{
					System.out.println("Invalid Music type");
				}
				break;
			}
			
			case 2 : 
			{
				System.out.println("You Selected Anirudh Music");
				System.out.println("Music Type : ");
				System.out.println("Melody -> 1");
				System.out.println("Folk -> 2");
				
				System.out.print("Enter the Music Type : ");
				int musicType = sc.nextInt();
				
				if(musicType == 1)
				{
					System.out.println("You Selected Melody Songs");
					System.out.println("Aathi -> 1");
					System.out.println("Oh Penne -> 2");
					
					System.out.print("Enter the Song : ");
					int song = sc.nextInt();
					
					if(song == 1)
					{
						System.out.println("Now Playing : Aathi");
					}
					else if (song == 2)
					{
						System.out.println("Now Playing : Oh Penne");
					}
					else
					{
						System.out.println("Invalid Song Selection");
					}
				}
				else if(musicType == 2)
				{
					System.out.println("You Selected Folk Songs");
					System.out.println("Vaathi Coming -> 1");
					System.out.println("Naa Ready Than -> 2");
					
					System.out.print("Enter the Song : ");
					int song = sc.nextInt();
					
					if(song == 1)
					{
						System.out.println("Now Playing : Vaathi Coming");
					}
					else if (song == 2)
					{
						System.out.println("Now Playing : Naa Ready Than");
					}
					else
					{
						System.out.println("Invalid Song Selection");
					}
				}
				else
				{
					System.out.println("Invalid Music type");
				}
				break;
			}
			
			case 3 : 
			{
				System.out.println("You Selected Yuvan Shankar Raja Music");
				System.out.println("Music Type : ");
				System.out.println("Melody -> 1");
				System.out.println("Folk -> 2");
				
				System.out.print("Enter the Music Type : ");
				int musicType = sc.nextInt();
				
				if(musicType == 1)
				{
					System.out.println("You Selected Melody Songs");
					System.out.println("Idhu Varai -> 1");
					System.out.println("Pirai Thedum -> 2");
					
					System.out.print("Enter the Song : ");
					int song = sc.nextInt();
					
					if(song == 1)
					{
						System.out.println("Now Playing : Idhu Varai");
					}
					else if (song == 2)
					{
						System.out.println("Now Playing : Pirai Thedum");
					}
					else
					{
						System.out.println("Invalid Song Selection");
					}
				}
				else if(musicType == 2)
				{
					System.out.println("You Selected Folk Songs");
					System.out.println("Iayyayo -> 1");
					System.out.println("Whistle Podu -> 2");
					
					System.out.print("Enter the Song : ");
					int song = sc.nextInt();
					
					if(song == 1)
					{
						System.out.println("Now Playing : Iayyayo");
					}
					else if (song == 2)
					{
						System.out.println("Now Playing : Whistle Podu");
					}
					else
					{
						System.out.println("Invalid Song Selection");
					}
				}
				else
				{
					System.out.println("Invalid Music type");
				}
				break;
			}
			default:
			{
				System.out.println("Invalid music director");
			}
		}
	}
}