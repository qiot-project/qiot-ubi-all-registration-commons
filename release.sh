
./mvnw --batch-mode release:prepare
./mvnw --batch-mode -Drepo.id=qiot-central -Drepo.login=$ARTIFACTORY_USER -Drepo.pwd=$ARTIFACTORY_PASSWORD release:perform
if [[ "$?" -ne 0 ]] ; then
  ./mvnw --batch-mode release:rollback
fi
