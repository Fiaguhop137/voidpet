package p371ub;

import Ad.j;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f55043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f55044b;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55043a = context;
        this.f55044b = j.b(new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID c(b bVar) {
        SharedPreferences sharedPreferences = bVar.f55043a.getSharedPreferences("dev.expo.EASSharedPreferences", 0);
        String string = sharedPreferences.getString("eas-client-id", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("eas-client-id", string);
            editorEdit.apply();
        }
        return UUID.fromString(string);
    }

    public final UUID b() {
        Object value = this.f55044b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (UUID) value;
    }
}
