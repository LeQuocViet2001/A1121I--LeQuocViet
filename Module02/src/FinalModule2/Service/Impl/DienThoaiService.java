package FinalModule2.Service.Impl;

import FinalModule2.Service.utils.NotFoundProductException;

public interface DienThoaiService {
    void themMoi();
    void xoa() throws NotFoundProductException;
    void timKiem();
    void hienThi() throws NotFoundProductException;
}
