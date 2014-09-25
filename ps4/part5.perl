

foreach $line ( <STDIN> ) {
$input .= $line;
}



$input =~ s/(<.*?[\n]*>(?!\"))//g;

print $input;