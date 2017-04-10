# curator-guava-example
Shows that Curator 3.3.0 works with Guava 21

To show non-shaded Guava run with Curator 3.2: 

```
mvn -P 3_2 clean compile exec:java -Dexec.mainClass=temp.CuratorGuavaTest
```

To show shaded Guava run with Curator 3.3: 

```
mvn -P 3_3 clean compile exec:java -Dexec.mainClass=temp.CuratorGuavaTest
```

To show non-shaded Guava run with Curator 2.11: 

```
mvn -P 2_11 clean compile exec:java -Dexec.mainClass=temp.CuratorGuavaTest
```

To show shaded Guava run with Curator 2.12: 

```
mvn -P 2_12 clean compile exec:java -Dexec.mainClass=temp.CuratorGuavaTest
```
