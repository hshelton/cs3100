open FILE, "email.txt";

while (<FILE>)
{
	while (m/(\w+?@\w+?\.(\w+?\.)*\w+)/g)
	{
		print "$1\n";
	
	}



}
