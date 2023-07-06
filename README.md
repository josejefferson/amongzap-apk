# AmongZap

## Gera um APK debug
```bash
./gradlew assembleDebug
```

## Gera um APK release
```bash
# Gera o APK
./gradlew assembleRelease

# Gera a chave de assinatura, se não tiver sido gerada ainda
keytool -genkey -v -keystore key.keystore -alias app-key -keyalg RSA -keysize 2048 -validity 10000

# Assina o APK digitalmente
jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 -keystore key.keystore app/build/outputs/apk/release/app-release-unsigned.apk app-key
```