package quanly.quanlynhansu;

import quanly.quanlynhansu.model.Staff;
import quanly.quanlynhansu.model.dao.StaffDao;
import quanly.quanlynhansu.model.dto.StaffDto;

import java.util.ArrayList;
import java.util.List;

public class StaffService {
    private StaffDao staffDao = null;

    public StaffService() {
        staffDao = new StaffDao();
    }

    public static List<StaffDto> findAll() {
        List<Staff> staffs = StaffDao.getAll();
        List<StaffDto> staffDtos = new ArrayList<>();

        for (Staff staff : staffs) {
            staffDtos.add(new StaffDto(
                    staff.getId(), staff.getName(),
                    staff.getAddress(), staff.getSalary(),staff.getStartDate(),staff.getPosition()));
        }

        return staffDtos;
    }

    public StaffDto find(int id) {
        Staff staff = staffDao.get(id);
        return new StaffDto(staff.getId(), staff.getName(),
                staff.getAddress(),staff.getPhone(),staff.getPosition(),staff.getStartDate(),staff.getSalary());
    }

    public void add(StaffDto staffDto) {
        Staff staff = new Staff(staffDto.getId(),
                staffDto.getName(), staffDto.getAddress(),
                staffDto.getSalary() ,
                staffDto.getStartDate(),
                staffDto.getPosition());
        staffDao.insert(staff);


    }

    public void edit(StaffDto staffDto) {
        Staff staff = new Staff(staffDto.getId(), staffDto.getName(),
                staffDto.getAddress(), staffDto.getPhone(),
                staffDto.getSalary(), staffDto.getLevel()
                , staffDto.getPosition());
        staffDao.update(staff);
    }

    public void remove(Integer id) {
        staffDao.delete(id);
    }
}
