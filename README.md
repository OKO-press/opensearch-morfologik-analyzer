# OpenSearch Morfologik Analyzer
This Repo is a OpenSearch Plugin allowing the use of Morfologik Analyzer

### Running the tests
You may need to install OpenSearch and build a local artifact for the integration tests and build tools ([Learn more here](https://github.com/opensearch-project/opensearch-plugins/blob/main/BUILDING.md)):

```
~/OpenSearch (main)> git checkout 1.0.0-beta1 -b beta1-release
~/OpenSearch (main)> ./gradlew publishToMavenLocal -Dbuild.version_qualifier=beta1 -Dbuild.snapshot=false
```

Now you can run all the tests like so:
```
./gradlew check
```

### Running testClusters with the plugin installed 
```
./gradlew run
```

Then you can see that your plugin has been installed by running: 
```
curl -XGET 'localhost:9200/_cat/plugins'
```

## License
This code is licensed under the Apache 2.0 License. See [LICENSE.txt](LICENSE.txt).

## Copyright
Copyright OKO.press Team and OpenSearch Contributors. See [NOTICE](NOTICE.txt) for details.
