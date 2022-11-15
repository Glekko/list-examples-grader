# Create your grading script here
CPATH=".:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar"
rm -rf student-submission
git clone $1 student-submission
cp TestListExamples.java student-submission
cd student-submission
if [ -e "ListExamples.java" ]
then
    echo "Correct file! Well done!"
else
    echo "Wrong file submission!"
    exit
fi
javac -cp $CPATH *.java
if [ $? -ne 0 ]
then
    echo "File did not compile!"
    exit
else
    echo "File successfuly compiled!"
fi
java -cp $CPATH org.junit.runner.JUnitCore TestListExamples &> testOutput.txt
cat testOutput.txt