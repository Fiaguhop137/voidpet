package p184k4;

import android.content.ContentResolver;
import android.provider.Settings;
import com.applovin.impl.j0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class T implements j0 {
    @Override // com.applovin.impl.j0
    public final String a(ContentResolver contentResolver, String str) {
        return Settings.System.getString(contentResolver, str);
    }
}
