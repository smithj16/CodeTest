The following solution to the code test consist of the following tools:
- java 17
- vertx library (using only the core API for JsonObject and JsonArray)
- gradle (used for managing the vertx core API dependency)

To run the code simply open the package in an IDE (I used IntelliJ) and
run the main class. I made one assumption when calculating the base case
for the assembleBackPack algorithm. We want to pack at least one of each item
from the available items list. This indicates that the minimum bag capacity should
be 11. I've included all test cases from the instructions but additional test
cases can be added.
