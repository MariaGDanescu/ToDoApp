<%@ include file="common/header.jspf"%>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="panel panel-primary">
				<div class="panel-heading">Add task</div>
				<div class="panel-body">
					<form:form method="post" modelAttribute="todo">
					 <form:hidden path="id" />
					 	<fieldset class="form-group">
							<form:label path="taskName">Task Name</form:label>
							<form:input path="taskName" type="text" class="form-control"
								required="required" />
							<form:errors path="taskName" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="description">Description</form:label>
							<form:input path="description" type="text" class="form-control"
								required="required" />
							<form:errors path="description" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="deadline">Deadline</form:label>
							<form:input path="deadline" type="date" class="form-control"
								required="required" />
							<form:errors path="deadline" cssClass="text-warning" />
						</fieldset>

						<button type="submit" class="btn btn-success">Save</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>