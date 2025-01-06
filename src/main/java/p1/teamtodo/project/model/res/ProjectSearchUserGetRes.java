package p1.teamtodo.project.model.res;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import p1.teamtodo.common.ResponseCode;
import p1.teamtodo.common.ResponseResult;
import p1.teamtodo.project.model.dto.ProjectSearchUserDto;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectSearchUserGetRes extends ResponseResult {

    private List<ProjectSearchUserDto> userList;

    public ProjectSearchUserGetRes(String code, List<ProjectSearchUserDto> userList) {
        super(code);
        this.userList = userList;
    }
}
