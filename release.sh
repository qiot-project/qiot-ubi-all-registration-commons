./mvnw --batch-mode release:prepare
./mvnw --batch-mode -Dqiot-central.username=$ARTIFACTORY_USER -Dqiot-central.password=$ARTIFACTORY_PASSWORD release:perform
if [[ "$?" -ne 0 ]] ; then
  ./mvnw --batch-mode release:rollback
fi