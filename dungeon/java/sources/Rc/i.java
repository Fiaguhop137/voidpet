package Rc;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11008b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f11009a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11009a = context.getSharedPreferences("expo.modules.notifications.SharedPreferencesNotificationCategoriesStore", 0);
    }

    private final String c(String str) {
        return "notification_category-" + str;
    }

    public final Collection a() {
        Ic.c cVar;
        Map<String, ?> all = this.f11009a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            if (StringsKt.O(key, "notification_category-", false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            try {
                String str = (String) ((Map.Entry) it.next()).getValue();
                if (str != null) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 2));
                    try {
                        try {
                            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                            try {
                                Object object = objectInputStream.readObject();
                                if (!(object instanceof Ic.c)) {
                                    throw new InvalidClassException("Expected serialized object to be an instance of " + Ic.c.class + ". Found: " + object);
                                }
                                kotlin.io.c.a(objectInputStream, null);
                                kotlin.io.c.a(byteArrayInputStream, null);
                                cVar = (Ic.c) object;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    kotlin.io.c.a(objectInputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        throw th3;
                    } catch (Throwable th4) {
                        kotlin.io.c.a(byteArrayInputStream, th3);
                        throw th4;
                    }
                } else {
                    cVar = null;
                }
            } catch (IOException | ClassNotFoundException unused) {
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public final Ic.c b(String identifier) throws IOException {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        String string = this.f11009a.getString(c(identifier), null);
        if (string == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(string, 2));
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                Object object = objectInputStream.readObject();
                if (object instanceof Ic.c) {
                    kotlin.io.c.a(objectInputStream, null);
                    kotlin.io.c.a(byteArrayInputStream, null);
                    return (Ic.c) object;
                }
                throw new InvalidClassException("Expected serialized object to be an instance of " + Ic.c.class + ". Found: " + object);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    kotlin.io.c.a(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        try {
            throw th3;
        } catch (Throwable th4) {
            kotlin.io.c.a(byteArrayInputStream, th3);
            throw th4;
        }
    }

    public final boolean d(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        String strC = c(identifier);
        if (this.f11009a.getString(strC, null) == null) {
            return false;
        }
        return this.f11009a.edit().remove(strC).commit();
    }

    public final Ic.c e(Ic.c notificationCategory) {
        Intrinsics.checkNotNullParameter(notificationCategory, "notificationCategory");
        SharedPreferences.Editor editorEdit = this.f11009a.edit();
        String strJ = notificationCategory.j();
        Intrinsics.checkNotNullExpressionValue(strJ, "getIdentifier(...)");
        if (editorEdit.putString(c(strJ), Rc.a.a(notificationCategory)).commit()) {
            return notificationCategory;
        }
        return null;
    }
}
