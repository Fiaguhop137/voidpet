package io.invertase.firebase.app;

import K9.C1135c;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import p083ea.h;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class ReactNativeFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1135c> getComponents() {
        return Collections.singletonList(h.b("react-native-firebase", c.f44177a));
    }
}
