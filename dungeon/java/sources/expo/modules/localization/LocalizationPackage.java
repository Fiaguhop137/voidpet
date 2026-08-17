package expo.modules.localization;

import android.content.Context;
import android.content.res.Configuration;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import p227mb.b;
import p227mb.g;
import p300qc.i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/localization/LocalizationPackage;", "Lmb/g;", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lmb/b;", "e", "(Landroid/content/Context;)Ljava/util/List;", "expo-localization_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalizationPackage implements g {

    public static final class a implements b {
        a() {
        }

        @Override // p227mb.b
        public void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            i.f51770a.b();
        }
    }

    @Override // p227mb.g
    public List e(Context context) {
        return CollectionsKt.e(new a());
    }
}
