# ThinkJava2Exercises
LaTeX source for _Exercises for Think Java_. This book is Copyright (c) 2021-2022 J. David Eisenberg.

The original book that this supplements (_Think Java, 2nd edition_), is Copyright (c) 2020 Allen B. Downey and Chris Mayfield, published in December 2019 by [O'Reilly Media](https://www.oreilly.com/library/view/think-java-2nd/9781492072492/) (ISBN 9781492072508).

Permission is granted to copy, distribute, and/or modify this work under the terms of the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License, which is available at https://creativecommons.org/licenses/by-nc-sa/4.0/.

The original form of this book of exercises is the LaTeX source code available from https://github.com/jdeisenberg/ThinkJava2Exercises.

The illustrations were drawn using xfig (http://www.xfig.org/) and dia (https://wiki.gnome.org/Apps/Dia/). These tools are free and open-source.

Compiling the LaTeX source has the effect of generating a device-independent representation of the book, which can be converted to other formats and printed.

To compile the PDF version from source:

    pdflatex thinkjava2ex.tex
    pdflatex thinkjava2ex.tex
    pdflatex thinkjava2ex.tex

The source code includes a Makefile that automates this process. On Linux, you may need to install texlive-latex-extra and texlive-fonts-recommended.

To build the HTML versions, the hevea package is required. Use the Makefile as follows:

    make hevea    # static html
    make trinket  # interactive
