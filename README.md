# EchOS
Operating System Simulator

# About

This is a project I wrote when I was 12 years old. This is actually one of the
first projects that I've worked on for quite some time. This project is now abandoned and
has now been left for public domain usage. So in a sense this project is somewhat important
to me even if it may not have been as significant and impressive as I believed it was at the time. (Oh Tiny-Bit younger me)

# History Lesson

I first started this project well.. When I first started coding. Almost. I coded many other Operating System simulators
before this and since I didn't know how to create actual full baremetal operating systems at the time. I picked a book on C++

however of course since I didn't really understand much of the concepts of basic programming languages and C++ certainly wasn't
a good starters choice to get into programming. I thus gave up on it but of course I got stubborn again and found out that maybe
python was a better choice for me. It ended becoming a good choice as I found something new I can to in my free time other than just
play video games and sit around then repeat the cycle again. Eventually because I had no knowledge of how operating systems worked I wondered
if I was able to create an entire OS from scratch In Python.

It sounds silly and dumb to me now but backthen I really thought that maybe it was possible. I eventually found one but it wasn't really
an OS it was more of a terminal application with an interface on it. But It didn't matter I had a ton of fun coding it and was proud of my
work. I kinda just recreated that again multiple times until eventually I wanted to learn a new language. I decided to do Java. Why Java?
Well I like the name, I started drinking coffee, and partly it was because of Notch's one single video on "coding with notch" and how impressive
I thought that Minecraft, an entire game was written their. And Thus is what started my Java Journey as I like to call it. People sometimes like to
critize me for using Java for certain projects mostly related to Projects that are typically coded in C++ Maybe like Game Engine Architecture for example.

While I do agree that Java may not be the most fastest and greatest language for a certain project. Java just so happened to be my second mothertone.
I became more fluent In Java than python despite it being a more difficult language than python I just really liked the OPP in it and its structure.
(I do understand in a professional setting though OPP is a bit of a... Lets just say hassle in that side. So I do understand the dislike towards Java and stigma)
I eventually thought of creating an Operating System In Java. Of course I found nothing other than "Java OS's" that really were just JVMS on top of assembly and C
that were required anyway..

I eventually learned C#. I am not so sure why but I just jumped over to C# and eventually found a library called Cosmos. Cosmos has the ability to convert just regular
High Level C# Code down into a fully fledged operating system. It had full blown ablity for file systems, Interface's and generally handled a ton of the black magic
for us. So I raced to get Cosmos setup and I started a new alteration of "EchOS" which was now an actual Operating System pretty much.

# So what went wrong?

I've continued the project for 8 months. To this day that is still the most amount of time I've ever spended in an project.
Cosmos was great and all but it wasn't perfect. 1. It was difficult to install. Especially for your first time. 2. Didn't work great on a computer in Bare metal
3. Needed PS/2 Keyboards if you wanted key detection working on baremetal. 4. PreFormatted FAT32 Hard Disk is essential otherwise it won't work so it forced you to either
have no file system in your OS or forced you to just use Vmware. 5. The Filesystem and certain shutdown and reboot commands only worked on certain virtualization platforms in this case
vmware. Virtualbox and qemu were pretty much off sale.

I also ultimately had a different I guess.. Vision (if you will) for the project and there are lots of problems with Cosmos that utimately hindered the progress on it.
So I had the option to make an entire Operating System from scratch. However it never worked out. I was constantly switching between Working on A Operating System from scratch
and trying to figure out the solutions to the problems out in Cosmos.

I ended up copying the code from osdev.org and some other sites and did not learn anything anyway. And realizing this I eventually gave up on the idea knowing I would have to start
completely from scratch again if I were to continue. And Cosmos was just not gonna work out So I ultimately went back to making an Operating System Simulator this time In Java. This is an
interface on top of debian or whatever your host OS really. So no real OS here but it was still a great and fun project for me to work on and that is all I care about.

# License

This Project Is Licensed under the Public Domain License. This means you may do whatever you please with the code with the freedom of choosing between
whether you give credit or not, whether you open source or not. You may use it for private usage, taking code from, Literally do anything you want with this
software.

More Details here: https://unlicense.org/
