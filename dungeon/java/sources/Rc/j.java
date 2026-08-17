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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11010b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f11011a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("expo.modules.notifications.SharedPreferencesNotificationsStore", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f11011a = sharedPreferences;
    }

    private final String c(String str) {
        return "notification_request-" + str;
    }

    private final SharedPreferences.Editor e(SharedPreferences.Editor editor, String str) {
        return editor.remove(c(str));
    }

    public final Collection a() {
        Ic.g gVar;
        Map<String, ?> all = this.f11011a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            if (StringsKt.O(key, "notification_request-", false, 2, null)) {
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
                                if (!(object instanceof Ic.g)) {
                                    throw new InvalidClassException("Expected serialized object to be an instance of " + Ic.g.class + ". Found: " + object);
                                }
                                kotlin.io.c.a(objectInputStream, null);
                                kotlin.io.c.a(byteArrayInputStream, null);
                                gVar = (Ic.g) object;
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
                    gVar = null;
                }
            } catch (IOException | ClassNotFoundException unused) {
            }
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    public final Ic.g b(String identifier) throws IOException {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        String string = this.f11011a.getString(c(identifier), null);
        if (string == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(string, 2));
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                Object object = objectInputStream.readObject();
                if (object instanceof Ic.g) {
                    kotlin.io.c.a(objectInputStream, null);
                    kotlin.io.c.a(byteArrayInputStream, null);
                    return (Ic.g) object;
                }
                throw new InvalidClassException("Expected serialized object to be an instance of " + Ic.g.class + ". Found: " + object);
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

    public final Collection d() {
        SharedPreferences.Editor editorEdit = this.f11011a.edit();
        Collection<Ic.g> collectionA = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(collectionA, 10));
        for (Ic.g gVar : collectionA) {
            Intrinsics.c(editorEdit);
            String strJ = gVar.j();
            Intrinsics.checkNotNullExpressionValue(strJ, "getIdentifier(...)");
            e(editorEdit, strJ);
            arrayList.add(gVar.j());
        }
        editorEdit.apply();
        return arrayList;
    }

    public final void f(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        SharedPreferences.Editor editorEdit = this.f11011a.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        e(editorEdit, identifier).apply();
    }

    public final void g(Ic.g notificationRequest) {
        Intrinsics.checkNotNullParameter(notificationRequest, "notificationRequest");
        SharedPreferences.Editor editorEdit = this.f11011a.edit();
        String strJ = notificationRequest.j();
        Intrinsics.checkNotNullExpressionValue(strJ, "getIdentifier(...)");
        editorEdit.putString(c(strJ), Rc.a.a(notificationRequest)).apply();
    }
}
