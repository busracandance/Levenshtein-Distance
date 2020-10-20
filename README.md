# Levenshtein Distance / Minimum Edit Distance(MED) Algorithm 

I.	INTRODUCTION 

Minimum edit distance (MED) or Levenshtein algorithm is used to rate the similarity between two sequences. In practice it is used to rate the similarity between words in search results.
In this study, a Levenshtein algorithm was implemented in Java. The program takes input as text and lists all words written incorrect with their first 5 alternative correct. It uses a text file as a sample word pool to perform these operations. The program outputs were analyzed separately according to the total running time and words - alternative correct words list for 20 words.

II.	DEFINITION OF THE ALGORITHM

A.	Methods, Inputs, and Outputs of the Program
    The following methods were used in the program:
    •	distance method- MED algorithm was used in this method. The actual process. Comparing is done by this method. Distance method is hearth of the code [1].
    •	main method – 
        	Taking inputs,
        	File operations, [2]
        	Calculating total running time, [3]
      are included in this method.
    •	Inputs- Any text.
    •	Outputs- Total running time and all words written incorrect with their first 5 alternative correct words.

III.	TEST RESULTS

Respectively,

Their alternatives - Total running times for each word.

* Test word = çocukluk

  Total running time= 0.0202


* Test word = çcklk

  Total running time= 0.0163


* Test word = rabıta

  Total running time= 0.0169


* Test word = rabı

  Total running time= 0.0154


* Test word = radikallşmek

  Total running time= 0.0225


* Test word = radikllşmk

  Total running time= 0.0209


* Test word = meyusiyet

  Total running time= 0.0254


* Test word = myusiytek

  Total running time= 0.0200


* Test word = mezcetmek

  Total running time= 0.0218


* Test word = mezctmek

  Total running time= 0.0237
  
  
* Test word = mıhlamak

  Total running time= 0.0335


* Test word = mıhlak
  
  Total running time= 0.0176


* Test word = istekle

  Total running time= 0.0256


* Test word = isteklekle

  Total running time= 0.0216


* Test word = çocuk bakıcısı

  Total running time= 0.0316


* Test word = acaba

  Total running time= 0.0170


* Test word = çocukça

  Total running time= 0.0172


* Test word = çoukça

  Total running time= 0.0185


* Test word = fakir

  Total running time= 0.0166


* Test word = fakitl

  Total running time= 0.0177


The program tested with 20 different words. 
The running times were computed for each word in seconds. 
A word was written correctly. Then, random changes were made in the letters and results were reached. 
These steps were performed for 10 different words. A total of 20 test words, alternative lists and running times were obtained. 
At the end of the study, it was found that with the same order, the similarity of letters increased and the distance and running times decreased.


 
REFERENCES

[1]	https://rosettacode.org/wiki/Levenshtein_distance#Java

[2]	https://stackoverflow.com/questions/1844688/how-to-read-all-files-in-a-folder-from-java

[3]	https://github.com/belenyasin/Java-Gecen-Sure-Hesaplama




