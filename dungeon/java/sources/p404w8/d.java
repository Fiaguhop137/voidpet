package p404w8;

import L8.AbstractBinderC1170q;
import L8.L;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import p296q8.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends AbstractBinderC1170q implements e {
    public d() {
        super("com.google.android.gms.games.internal.IGamesCallbacks");
    }

    @Override // L8.AbstractBinderC1170q
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 6001 || i10 == 6002) {
            parcel.readString();
            L.e(parcel);
        } else if (i10 == 12011) {
            DataHolder dataHolder = (DataHolder) L.b(parcel, DataHolder.CREATOR);
            L.e(parcel);
            d0(dataHolder);
        } else if (i10 == 12012) {
            int i12 = parcel.readInt();
            String string = parcel.readString();
            L.e(parcel);
            o0(i12, string);
        } else if (i10 == 13001) {
            L.e(parcel);
        } else if (i10 == 13002) {
            parcel.readInt();
            L.e(parcel);
        } else if (i10 == 19001) {
            parcel.readInt();
            L.e(parcel);
        } else if (i10 != 19002) {
            switch (i10) {
                case 5001:
                    parcel.readInt();
                    parcel.readString();
                    L.e(parcel);
                    break;
                case 5002:
                    DataHolder dataHolder2 = (DataHolder) L.b(parcel, DataHolder.CREATOR);
                    L.e(parcel);
                    Y(dataHolder2);
                    break;
                case 5003:
                    int i13 = parcel.readInt();
                    String string2 = parcel.readString();
                    L.e(parcel);
                    J0(i13, string2);
                    break;
                case 5004:
                    DataHolder dataHolder3 = (DataHolder) L.b(parcel, DataHolder.CREATOR);
                    L.e(parcel);
                    U(dataHolder3);
                    break;
                case 5005:
                    Parcelable.Creator<DataHolder> creator = DataHolder.CREATOR;
                    DataHolder dataHolder4 = (DataHolder) L.b(parcel, creator);
                    DataHolder dataHolder5 = (DataHolder) L.b(parcel, creator);
                    L.e(parcel);
                    K(dataHolder4, dataHolder5);
                    break;
                case 5006:
                    DataHolder dataHolder6 = (DataHolder) L.b(parcel, DataHolder.CREATOR);
                    L.e(parcel);
                    B0(dataHolder6);
                    break;
                case 5007:
                    DataHolder dataHolder7 = (DataHolder) L.b(parcel, DataHolder.CREATOR);
                    L.e(parcel);
                    i0(dataHolder7);
                    break;
                case 5008:
                    DataHolder dataHolder8 = (DataHolder) L.b(parcel, DataHolder.CREATOR);
                    L.e(parcel);
                    t0(dataHolder8);
                    break;
                case 5009:
                    L.e(parcel);
                    break;
                case 5010:
                    L.e(parcel);
                    break;
                case 5011:
                    L.e(parcel);
                    break;
                default:
                    switch (i10) {
                        case 5016:
                            i();
                            break;
                        case 5017:
                            L.e(parcel);
                            break;
                        case 5018:
                            L.e(parcel);
                            break;
                        case 5019:
                            L.e(parcel);
                            break;
                        case 5020:
                            parcel.readInt();
                            parcel.readString();
                            L.e(parcel);
                            break;
                        case 5021:
                            L.e(parcel);
                            break;
                        case 5022:
                            L.e(parcel);
                            break;
                        case 5023:
                            L.e(parcel);
                            break;
                        case 5024:
                            L.e(parcel);
                            break;
                        case 5025:
                            L.e(parcel);
                            break;
                        case 5026:
                            parcel.createStringArray();
                            L.e(parcel);
                            break;
                        case 5027:
                            parcel.createStringArray();
                            L.e(parcel);
                            break;
                        case 5028:
                            parcel.createStringArray();
                            L.e(parcel);
                            break;
                        case 5029:
                            parcel.createStringArray();
                            L.e(parcel);
                            break;
                        case 5030:
                            parcel.createStringArray();
                            L.e(parcel);
                            break;
                        case 5031:
                            parcel.createStringArray();
                            L.e(parcel);
                            break;
                        case 5032:
                            L.e(parcel);
                            break;
                        case 5033:
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readString();
                            L.e(parcel);
                            break;
                        case 5034:
                            parcel.readInt();
                            parcel.readString();
                            L.a(parcel);
                            L.e(parcel);
                            break;
                        case 5035:
                            L.e(parcel);
                            break;
                        case 5036:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 5037:
                            L.e(parcel);
                            break;
                        case 5038:
                            L.e(parcel);
                            break;
                        case 5039:
                            L.e(parcel);
                            break;
                        case 5040:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 9001:
                            L.e(parcel);
                            break;
                        case 11001:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 12001:
                            DataHolder dataHolder9 = (DataHolder) L.b(parcel, DataHolder.CREATOR);
                            L.e(parcel);
                            X0(dataHolder9);
                            break;
                        case 14001:
                            L.e(parcel);
                            break;
                        case 15001:
                            DataHolder dataHolder10 = (DataHolder) L.b(parcel, DataHolder.CREATOR);
                            L.e(parcel);
                            l(dataHolder10);
                            break;
                        case 17002:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 19008:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 19009:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 19010:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 20001:
                            L.e(parcel);
                            break;
                        case 20002:
                            L.e(parcel);
                            break;
                        case 20003:
                            L.e(parcel);
                            break;
                        case 20004:
                            L.e(parcel);
                            break;
                        case 20005:
                            L.e(parcel);
                            break;
                        case 20006:
                            L.e(parcel);
                            break;
                        case 20007:
                            L.e(parcel);
                            break;
                        case 20008:
                            L.e(parcel);
                            break;
                        case 20009:
                            L.e(parcel);
                            break;
                        case 20012:
                            L.e(parcel);
                            break;
                        case 20019:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 20020:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 23001:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 23002:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 23003:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 23004:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 23005:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 24002:
                            L.a(parcel);
                            L.e(parcel);
                            break;
                        case 25002:
                            parcel.readString();
                            L.e(parcel);
                            break;
                        case 25003:
                            Status status = (Status) L.b(parcel, Status.CREATOR);
                            String string3 = parcel.readString();
                            L.e(parcel);
                            p0(status, string3);
                            break;
                        case 25004:
                            L.e(parcel);
                            break;
                        case 25005:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 25006:
                            parcel.readInt();
                            L.e(parcel);
                            break;
                        case 25007:
                            Status status2 = (Status) L.b(parcel, Status.CREATOR);
                            String string4 = parcel.readString();
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            L.e(parcel);
                            Q0(status2, string4, arrayListCreateStringArrayList);
                            break;
                        default:
                            switch (i10) {
                                case 8001:
                                    DataHolder dataHolder11 = (DataHolder) L.b(parcel, DataHolder.CREATOR);
                                    L.e(parcel);
                                    O0(dataHolder11);
                                    break;
                                case 8002:
                                    parcel.readInt();
                                    L.e(parcel);
                                    break;
                                case 8003:
                                    L.e(parcel);
                                    break;
                                case 8004:
                                    L.e(parcel);
                                    break;
                                case 8005:
                                    L.e(parcel);
                                    break;
                                case 8006:
                                    L.e(parcel);
                                    break;
                                case 8007:
                                    parcel.readInt();
                                    parcel.readString();
                                    L.e(parcel);
                                    break;
                                case 8008:
                                    L.e(parcel);
                                    break;
                                case 8009:
                                    parcel.readString();
                                    L.e(parcel);
                                    break;
                                case 8010:
                                    parcel.readString();
                                    L.e(parcel);
                                    break;
                                default:
                                    switch (i10) {
                                        case 10001:
                                            L.e(parcel);
                                            break;
                                        case 10002:
                                            parcel.readString();
                                            L.e(parcel);
                                            break;
                                        case 10003:
                                            L.e(parcel);
                                            break;
                                        case 10004:
                                            L.e(parcel);
                                            break;
                                        case 10005:
                                            parcel.readInt();
                                            L.e(parcel);
                                            break;
                                        case 10006:
                                            L.e(parcel);
                                            break;
                                        default:
                                            switch (i10) {
                                                case 12004:
                                                    DataHolder dataHolder12 = (DataHolder) L.b(parcel, DataHolder.CREATOR);
                                                    a aVar = (a) L.b(parcel, a.CREATOR);
                                                    L.e(parcel);
                                                    x(dataHolder12, aVar);
                                                    break;
                                                case 12005:
                                                    DataHolder dataHolder13 = (DataHolder) L.b(parcel, DataHolder.CREATOR);
                                                    L.e(parcel);
                                                    y(dataHolder13);
                                                    break;
                                                case 12006:
                                                    L.e(parcel);
                                                    break;
                                                case 12007:
                                                    L.e(parcel);
                                                    break;
                                                case 12008:
                                                    L.e(parcel);
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 12014:
                                                            L.e(parcel);
                                                            break;
                                                        case 12015:
                                                            parcel.readInt();
                                                            L.e(parcel);
                                                            break;
                                                        case 12016:
                                                            L.e(parcel);
                                                            break;
                                                        case 12017:
                                                            DataHolder dataHolder14 = (DataHolder) L.b(parcel, DataHolder.CREATOR);
                                                            String string5 = parcel.readString();
                                                            Parcelable.Creator<a> creator2 = a.CREATOR;
                                                            a aVar2 = (a) L.b(parcel, creator2);
                                                            a aVar3 = (a) L.b(parcel, creator2);
                                                            a aVar4 = (a) L.b(parcel, creator2);
                                                            L.e(parcel);
                                                            S(dataHolder14, string5, aVar2, aVar3, aVar4);
                                                            break;
                                                        default:
                                                            return false;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            parcel.readInt();
            L.a(parcel);
            L.e(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
