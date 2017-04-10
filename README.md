# curator-guava-example
Shows that Curator 3.3.0 works with Guava 21

To show non-shaded Guava run: `mvn -P 3_2 clean compile exec:java -Dexec.mainClass=temp.CuratorGuavaTest`

To show shaded Guava run: `mvn -P 3_3 clean compile exec:java -Dexec.mainClass=temp.CuratorGuavaTest`
