package Xc;

import expo.modules.securestore.SecureStoreOptions;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes2.dex */
public interface c {
    String a(SecureStoreOptions secureStoreOptions, boolean z10);

    String b(SecureStoreOptions secureStoreOptions);

    KeyStore.Entry c(KeyStore keyStore, SecureStoreOptions secureStoreOptions);
}
