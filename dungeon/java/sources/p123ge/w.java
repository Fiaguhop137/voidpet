package p123ge;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import p302qe.n;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends y implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f42403a;

    public w(Field member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f42403a = member;
    }

    @Override // p302qe.n
    public boolean J() {
        return R().isEnumConstant();
    }

    @Override // p302qe.n
    public boolean O() {
        return false;
    }

    @Override // p123ge.y
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Field R() {
        return this.f42403a;
    }

    @Override // p302qe.n
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public E getType() {
        E.a aVar = E.f42351a;
        Type genericType = R().getGenericType();
        Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
        return aVar.a(genericType);
    }
}
